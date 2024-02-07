package phoneuser;

public class Xiaomi implements Phone {
    
    private int volume;
    private boolean isPowerOn;
    
    public Xiaomi(){
        this.volume = 50;
    }
    @Override
    public void powerOn(){
        isPowerOn = true;
        System.out.println("Handphone menyala");
        System.out.println("Selamat Datang Di Xiaomi");
        System.out.println("Android Version 29");
    }
    
    @Override
    public void powerOff(){
        isPowerOn = false;
        System.out.println("Handphone Dimatikan");
    }
    
    @Override
    public void volumeUp(){
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume FULL");
                System.out.println("sudah " + this.getVolume() + "%"); 
            }
            else{
                this.volume += 10;
                System.out.println("Nylakan duli donk HP - NYAA");
            }  
        }
    }
    
    @Override
    public void volumeDown(){
        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume = 0%");
            }
            else{
                this.volume -= 10;
                System.out.println("Volume sekarang : " + this.getVolume());
            }
        }else{
                System.out.println("Nyalakan dulu donk hp - nyaa");
            }
        }
         public int getVolume(){
            return this.volume;
        }
    }

       
          
