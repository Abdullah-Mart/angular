package com.djs.e_generics.d_genericblockchain;

import java.util.ArrayList;
import java.util.List;

public class BlockChain {
    public static void main(String[] args) {

        List<Block<Transaction>> blockChainList =  new ArrayList<>();

        Transaction genesis = new Transaction( 1, 234.67F, "Rene", "Mila");
        Block<Transaction> genesisBlock = new Block<>(genesis, 0);
        blockChainList.add( genesisBlock);

        Transaction mila = new Transaction( 2, 34.67F, "Mila", "Rene");
        Block<Transaction> milaBlock = new Block<>(mila, blockChainList.get(blockChainList.size()-1).getHash());
        blockChainList.add( milaBlock);

        Transaction rene = new Transaction( 3, 334.67F, "Rene", "Jacky");
        Block<Transaction> reneBlock = new Block<>(rene, blockChainList.get(blockChainList.size()-1).getHash());
        blockChainList.add( reneBlock);//world

        Transaction jacky = new Transaction( 4, 384.67F, "Jacky", "Mila");
        Block<Transaction> jackyBlock = new Block<>(jacky, blockChainList.get(blockChainList.size()-1).getHash());
        blockChainList.add(jackyBlock);

        System.out.println("---------------------");
        System.out.println("- BlockChain -");
        System.out.println("---------------------");
        blockChainList.forEach(System.out::println);
        System.out.println("---------------------");
        System.out.println("Is valid?: " + validate(blockChainList));
        System.out.println("---------------------");

        // corrupt Block chain by modifying one of the Blocks
        int index = blockChainList.indexOf(milaBlock);
        Transaction meTransaction = new Transaction( 5, 12334.67F, "Rene", "Me");
        Block<Transaction> corruptBlock = new Block<>(meTransaction, blockChainList.get(index -1).getHash());

        blockChainList.remove(index);
        blockChainList.add(index, corruptBlock);
        System.out.println("Corrupted Block chain by replacing 'Mila' Block with 'Hi' Block");

        System.out.println("---------------------");
        System.out.println("- BlockChain -");
        System.out.println("---------------------");
        blockChainList.forEach(System.out::println);
        System.out.println("---------------------");
        System.out.println("Is valid?: " + validate(blockChainList));
        System.out.println("---------------------");


    }

    private static boolean validate(List<Block<Transaction>> GenericBlockChain) {
        boolean result = true;

        Block<Transaction> lastGenericBlock = null;
        for (int i = GenericBlockChain.size() - 1; i >= 0; i--) {
            if (lastGenericBlock == null) {
                lastGenericBlock = GenericBlockChain.get(i);
            } else {
                Block<Transaction> current = GenericBlockChain.get(i);
                if (lastGenericBlock.getPreviousHash() != current.getHash()) {
                    result = false;
                    break;
                }
                lastGenericBlock = current;
            }
        }
        return result;
    }
}