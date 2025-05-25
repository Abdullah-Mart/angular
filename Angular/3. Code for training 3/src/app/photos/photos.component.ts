import { Component, OnInit } from '@angular/core';
import { PhotoService } from '../photo.service';

@Component({
  selector: 'app-photos',
  templateUrl: './photos.component.html',
  styleUrls: []
})
export class PhotosComponent implements OnInit {
  
  photos: any;
  photosSubscribtion: any;

  getPhoto() {
    this.photosSubscribtion = this.photoService.getPhoto()
      .subscribe(data => this.photos = data);
  }

  constructor(private photoService: PhotoService) { }

  ngOnInit(): void {
    this.getPhoto();
  }

  ngOnDestroy(): void {
    this.photosSubscribtion.unsubscribe();
  }

}
