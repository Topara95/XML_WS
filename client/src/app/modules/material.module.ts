import { NgModule } from '@angular/core';
import { LayoutModule } from '@angular/cdk/layout';
import {
  MatToolbarModule,
  MatButtonModule,
  MatSidenavModule,
  MatIconModule,
  MatListModule,
  MatFormFieldModule,
  MatInputModule,
  MatCardModule,
  MatChipsModule,
  MatDialogModule,
  MatSnackBarModule,
  MatGridListModule,
  MatExpansionModule,
  MatDatepickerModule,
  MatNativeDateModule,
  MatSelectModule,
  MatTableModule,
  MatTooltipModule,
  MatCheckboxModule,
  MatMenuModule
} from '@angular/material';

const modules: any[] = [
  LayoutModule,
  MatToolbarModule,
  MatButtonModule,
  MatSidenavModule,
  MatIconModule,
  MatListModule,
  MatFormFieldModule,
  MatInputModule,
  MatCardModule,
  MatChipsModule,
  MatDialogModule,
  MatSnackBarModule,
  MatGridListModule,
  MatExpansionModule,
  MatDatepickerModule,
  MatNativeDateModule,
  MatSelectModule,
  MatTableModule,
  MatTooltipModule,
  MatCheckboxModule,
  MatMenuModule
];

@NgModule({
  imports: [modules],
  exports: [modules]
})
export class MaterialModule { }
