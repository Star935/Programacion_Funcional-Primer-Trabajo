package BiConsumer;

import java.util.function.BiConsumer;

public class MainGym {
    public static void main(String[] args) {
        Gym gym = new Gym("More protein,less carbohydrates",6,1);
        GymPurpose gymPurpose = new GymPurpose("Definition");
        BiConsumer<Gym,GymPurpose> biConsumer = (gy,pu)->gy.setFood(pu.getPurpose());
        biConsumer.accept(gym,gymPurpose);
        System.out.println("Gym Objective " + gym.getFood());
        System.out.println("Days of gym " + gym.getDays());
        System.out.println("Days of relax " + gym.getRelaxDay());
    }
}
