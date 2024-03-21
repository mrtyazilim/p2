package VarliksalSiniflar;

/**
 @author Murat Değirmenci,UPoDer
 
 */

/*
1.get , set, üye değişken tanımlamaları için ide destekleri öğrenilmeli
git git hub öğrenilmeli

*/
public class User {
    public String username,password,name,surname;
    //public char[] tckn= {'1','1','2','2','3','4','4','5','5','5','5'};
    public char[] tckn=new char[11];
    // burası belki de string olmalı
    //tarih saat ekle
    //zorunlu alanarı nasıl yapmalıyım

    enum gender {        Kadin,        Erkek    };

    public void addUser(){
        /** 
        
        @mrtyazilim
        @addUser(), veriyi metin belgesine şu sıralamayka ekler:
        username|password|name|surname|tckn|gender.

        */
       try{
            FileWriter userFileWriter=new FileWriter(DOMAIN_CONSTANT.USERDATAPATH,true);
            //StringBuilder userStringBuilder=new StringBuilder();
            String user=username+"|"+password+"|"+name+"|"+surname+"|";
            userFileWriter.write(user);
            userFileWriter.write(System.lineSeparator());
                                                            
                                                                                             
        //
       }
        catch (FileNotFoundException fileNotFoundException)// buraya gerçekten gerek var mı bilemedim
        {

        }catch (IOException ioException){

        }catch (Exception e){
            System.out.println("Anlamlandırılamayan bir hata oluştu.");
        }// burayı iyileştirmeli . şu an için ikisine de  print s t yapacağım galiba


    }
    

    


}
