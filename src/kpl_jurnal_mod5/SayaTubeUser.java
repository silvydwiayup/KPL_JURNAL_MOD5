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

import java.util.ArrayList;
import java.util.Random;

public class SayaTubeUser {

    private int id;
    private ArrayList<SayaTubeVideo> uploadedVideos;
    private String username;

    public SayaTubeUser(String name){
        if(name == "" || name == null || name.length() >= 100){
            throw new IllegalArgumentException("Nama tidak boleh kosong!! dan Title tidak boleh lebih dari 100 karakter");
        }
        Random rand = new Random();
        this.uploadedVideos = new ArrayList<SayaTubeVideo>();
        this.username = name;
        this.id = rand.nextInt(100000); // Not used
    }
    

    public void printAllVideoPlaycount(){
        System.out.println("User : "+this.username);
        for (int i = 0; i<uploadedVideos.size()&&i<8;i++){
            System.out.printf("Video %d judul : %s\n",i+1,uploadedVideos.get(i).getTitle());
        }
    }
    
    public void addVideo(SayaTubeVideo vid){
        if (vid.getPlayCount() >= Integer.MAX_VALUE){
            throw new IllegalArgumentException("Playcount melebihi batas");
        }
        uploadedVideos.add(vid);
    }
    
        public int getTotalVideoPlayCount(){
        int ttl = 0;
        for(int i = 0; i<uploadedVideos.size();i++){
            try {
                int x = ttl + uploadedVideos.get(i).getPlayCount();
                if(x < 0){
                    throw new Exception("Max Integer value reached!!");
                }
                ttl = x;
            } catch (Exception e) {
                System.out.println("Gagal menambahkan view untuk video "+uploadedVideos.get(i).getTitle()+ " "+e);
            }
        }
        return ttl;
    }
}
