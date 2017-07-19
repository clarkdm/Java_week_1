import java.util.ArrayList;

/**
 * Created by dmclark on 18/07/17.
 */
public class Paint_Wizard {
    ArrayList<Paint> bobs;

    public Paint_Wizard() {
        bobs = new ArrayList<Paint>();


    }

    private void sort() {

    }

    public void add_Paint(Paint p) {
        bobs.add(p);

    }

    public String get_least_wastes(int a) {
        String return_S = "";
        if (!bobs.isEmpty()) {
            int best = 0;
            double best_Wastes = 99999;
            int[] best_s = new int[2];

            for (int i = 0; i < bobs.size(); i++) {
                double cuverie = bobs.get(i).get_totel_cuverie();
//                while (cuverie < a) {
//                    cuverie = cuverie + bobs.get(i).get_totel_cuverie();
//                }
                cuverie = bobs.get(i).num_Tins(a)*bobs.get(i).get_cuverie();

                 if (cuverie - a < best_Wastes) {
                    best = i;
                    best_s = new int[1];
                    best_s[0] = i;
                    best_Wastes = (cuverie - a) / bobs.get(best).getCover();
                } else if (cuverie - a == best_Wastes) {
                    int x = best_s.length;
                    best_s = new int[x + 1];
                    best_s[x] = i;
                }

            }
            for (int i = 0; i < best_s.length; i++) {
                int can = bobs.get(i).num_Tins(a);
                DecimalFormat df = new DecimalFormat("0.##");
                df.format(7.8);
                if (i == 0) {

                    return_S = bobs.get(i).getName() + " cans " + can + " £" + (can * bobs.get(i).getCost());
                } else {
                    return_S = return_S + "\n" + bobs.get(i).getName() + " cans " + can + " £" + (can * bobs.get(i).getCost());
                }
            }

            return_S = return_S + "\n" + best_Wastes  + " Litres wastes";

        }
        return return_S;
    }
}


