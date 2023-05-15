package OOP_Lab3.AimProjects.hust.soict.globalict.test.store;

import OOP_Lab3.AimProjects.hust.soict.globalict.aims.store.Store;
import OOP_Lab3.AimProjects.hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class StoreTest {
    public static void main(String[] args) {
     //Create a new cart
     Store store=new Store() ;
     //Create new dvd objects and add them to the cart
     DigitalVideoDisc dvd1=new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
     store.addDVD(dvd1);

     DigitalVideoDisc dvd2=new DigitalVideoDisc("Star Wars", "Science Fiction", "Geogre Lucas",87,24.95f);
     store.addDVD(dvd2);

     DigitalVideoDisc dvd3=new DigitalVideoDisc("Aladin","Animation",18.99f);
     store.addDVD(dvd3);
     
     store.displayAllDVDs();

     store.removeDVD(dvd2);

     store.displayAllDVDs();

    }
}
