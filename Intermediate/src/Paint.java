

/**
 * Created by dmclark on 18/07/17.
 */
public class Paint {
    String name = "";
    private double cover = 0;
    double litres = 0;
    double cost = 0;

    public Paint(double cover, double litres, double cost, String s) {
        name = s;
        this.cost = cost;
        this.cover = cover;
        this.litres = litres;
    }

    public int num_Tins(int a) {

        int temp = a / get_totel_cuverie();

//        System.out.println("test # " + get_totel_cuverie() +" ## @@ "+ a);
//        System.out.println("test @ " + get_totel_cuverie() / a);
//        System.out.println("test ? " + temp);
        if ((get_totel_cuverie() % a) > 0) {
            temp = temp + 1;
        }
//        System.out.println("test ? " + temp);

        return (int) temp;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double get_cuverie() {
        return cover * litres;
    }

    public double get_cost_per_litre() {
        return cost / litres;
    }

    public double get_cost_per_M2() {
        return cost / (cover * litres);
    }

    public int get_totel_cuverie() {
        return (int) (cover * litres);
    }


    public double getCover() {
        return cover;
    }

    public void setCover(double cover) {
        this.cover = cover;
    }

    public double getLitres() {
        return litres;
    }

    public void setLitres(double litres) {
        this.litres = litres;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
