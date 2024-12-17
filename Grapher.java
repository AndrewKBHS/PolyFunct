public class Grapher {
    private int type;

    private double y;

    private double m;
    private double b;

    private double a;
    //b already defined in first power
    private double c;

    //a, b, c already defined in second power
    private double d;

    public Grapher(double y) {
        this.y = y;
        type = 0;
    }
    public Grapher(double m, double b) {
        this.m = m;
        this.b = b;
        type = 1;
    }

    public Grapher(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        type = 2;
    }

    public Grapher(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        type = 3;
    }

    public double f(int x) {
        if (type==0) {
            return y;
        }
        else if (type==1) {
            return (m*x + b);
        }
        else if (type==2) {
            return (a*Math.pow(x, 2) + b*x + c);
        }
        else { //type == 3;
            return (a*Math.pow(x,3) + b*Math.pow(x, 2) + c*x + d);
        }
    }

    public static void graph(int a, int b, Stars star, Grapher function) {
        for (int r = a; r <= b; r++) {
            double y = function.f(r);
            String s = star.convert(y);
            //create y-axis
            if (r == 0) {
                if (y > 0) {
                    for (int i = 0; i < 50; i++) {
                        System.out.print("-");
                    }
                    System.out.printf("+" + "%.50s", s);
                    for (int i = (int) y; i < 50; i++) {
                        System.out.print("-");
                    }
                }
                else if (y < 0) {
                    for (int i = -50; i < (int) y; i++) {
                        System.out.print("-");
                    }
                    System.out.printf("%.50s" + "+", s);
                    for (int i=0; i<50; i++) {
                        System.out.print("-");
                    }
                }
                else {//if y=0
                    System.out.printf("%50s" + star.getOption() + "%50s", "", "");
                }
            }


            else {  //graphing point
                if (y>0) {
                    System.out.printf("%50s|%.50s", "", s);
                }
                else if (y<0) {
                    System.out.printf("%50.50s|%50s", s, "");
                }
                else { //y=0
                    System.out.printf("%50s%50s", "", "");
                }
            }
            System.out.println();
        }
    }

}
