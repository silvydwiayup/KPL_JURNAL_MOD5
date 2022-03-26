/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpl_jurnal_mod5;

/**
 *
 * @author Silvy Dwi Ayu P
 */
public class KPL_JURNAL_MOD5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SayaTubeVideo video1 = new SayaTubeVideo("Review Fight For My Way oleh Silvy Dwi Ayu Puspita");
        SayaTubeVideo video2 = new SayaTubeVideo("Review What's Wrong With Secretary Kim oleh Silvy Dwi Ayu Puspita");
        SayaTubeVideo video3 = new SayaTubeVideo("Review Descendats Of The Sun  oleh Silvy Dwi Ayu Puspita");
        SayaTubeVideo video4 = new SayaTubeVideo("Review Yowis Ben oleh Silvy Dwi Ayu Puspita");
        SayaTubeVideo video5 = new SayaTubeVideo("Review Yowis Ben 2 oleh Silvy Dwi Ayu Puspita");
        SayaTubeVideo video6 = new SayaTubeVideo("Review Trolls oleh Silvy Dwi Ayu Puspita");
        SayaTubeVideo video7 = new SayaTubeVideo("Review Toy Story oleh Silvy Dwi Ayu Puspita");
        SayaTubeVideo video8 = new SayaTubeVideo("Review Bussiness Proposal oleh Silvy Dwi Ayu Puspita");
        SayaTubeVideo video9 = new SayaTubeVideo("Review Twenty One Twenty Five oleh Silvy Dwi Ayu Puspita");
        SayaTubeVideo video10 = new SayaTubeVideo("Review The Dolls oleh Silvy Dwi Ayu Puspita");
        video1.increasePlayCount(25000000);
        video2.increasePlayCount(25000000);
        video3.increasePlayCount(25000000);
        video4.increasePlayCount(25000000);
        video5.increasePlayCount(25000000);
        video6.increasePlayCount(25000000);
        video7.increasePlayCount(25000000);
        video8.increasePlayCount(25000000);
        video9.increasePlayCount(25000000);
        video10.increasePlayCount(25000000);


        SayaTubeUser username = new SayaTubeUser("Silvy Dwi Ayu Puspita");
        username.addVideo(video1);
        username.addVideo(video2);
        username.addVideo(video3);
        username.addVideo(video4);
        username.addVideo(video5);
        username.addVideo(video6);
        username.addVideo(video7);
        username.addVideo(video8);
        username.addVideo(video9);
        username.addVideo(video10);

        username.printAllVideoPlaycount();
        System.out.println("Total playcount : "+username.getTotalVideoPlayCount());
    }
    
}
