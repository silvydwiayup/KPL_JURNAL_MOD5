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
import java.util.Random;
public class SayaTubeVideo {
    private int id;
    private String title;
    private int playCount;
    
 

    public void increasePlayCount(int i){
        if(i > 25000000 || i < 0){
            throw new IllegalArgumentException("Penambahan View maksimal 25.000.000");
        }
        try {
            int x = this.playCount + i;
            if(x < 0){
                throw new Exception("Max Integer");
            }
            this.playCount += i;
        } catch (Exception e) {
            System.out.println("Gagal menambahkan view "+e);
        }
    }
    
     public SayaTubeVideo(String title){
        if(title == "" || title == null || title.length() >= 200){
            throw new IllegalArgumentException("Title tidak boleh kosong");
        }
        Random rand = new Random();
        this.title = title;
        this.id = rand.nextInt(100000);
        this.playCount = 0;
    }
    public void printVideoDetails(){
        System.out.printf("Title\t: %s\nId\t: %d\nViews\t: %d\n",this.title,this.id,this.playCount);
    }

    public int getPlayCount(){
        return this.playCount;
    }

    public String getTitle(){
        return this.title;
    }
}
