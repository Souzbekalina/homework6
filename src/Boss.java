public class Boss extends GameEnity {
   private Weapon bossWeapon;

    public Weapon getBossWeapon() {
        return bossWeapon;
    }

    public void setBossWeapon(String luke) {
        this.bossWeapon = bossWeapon;
    }
     public String info(){
        return "Boss health:" + this.getHealth() + "damage" + this.getDamage() + "weapon" + this.getBossWeapon();
     }
}







