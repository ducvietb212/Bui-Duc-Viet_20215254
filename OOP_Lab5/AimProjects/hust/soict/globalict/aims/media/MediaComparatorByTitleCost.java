package AimProjects.hust.soict.globalict.aims.media;

import java.util.Comparator;


public class MediaComparatorByTitleCost implements Comparator<Media> {
    public int compare(Media m1, Media m2){
        if(m1.getTitle().compareTo(m2.getTitle())==0){
            if(m1.getCost()>m2.getCost()){
                return -1;
            }
            else{
                return 1;
            }
        }
    else{
        return m1.getTitle().compareTo((m2.getTitle()));
    }
    
}
}
