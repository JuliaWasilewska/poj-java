package Lab4.Ex1;

public class Fraction {
    int numerator;
    int divider;

    public Fraction(int numerator,int divider){
        this.numerator = numerator;
        this.divider = divider;
    }

    public void add(Fraction fraction){
        Fraction sum = new Fraction(0,0);
        if (this.divider == fraction.divider){
            sum.numerator = this.numerator + fraction.numerator;
            sum.divider = this.divider;
        }
        else {
            sum.numerator = this.numerator * fraction.divider + fraction.numerator * this.divider;
            sum.divider = this.divider * fraction.divider;
        }
        if (gcd(sum) != 1){
            int tempDiv = gcd(sum);
            sum.numerator /= tempDiv;
            sum.divider /= tempDiv;
        }
        System.out.println("Operation:");
        System.out.println( this.writeFraction() + " + " + fraction.writeFraction() + " = " + sum.writeFraction());
    }

    public void sub(Fraction fraction){
        Fraction sub = new Fraction(0,0);
        boolean lessThenZero = false;
        if (this.divider == fraction.divider){
            sub.numerator = this.numerator - fraction.numerator;
            sub.divider = this.divider;
        }
        else {
            sub.numerator = this.numerator * fraction.divider - fraction.numerator * this.divider;
            sub.divider = this.divider * fraction.divider;
        }
        if (sub.numerator < 0){
            lessThenZero = true;
            sub.numerator *= -1;
        }
        if (gcd(sub) > 1 && sub.numerator != 0){
            int tempDiv = gcd(sub);
            sub.numerator /=  tempDiv;
            sub.divider /=  tempDiv;
        }
        System.out.println("Operation:");
        if (lessThenZero){
            System.out.println(this.writeFraction() + " - " + fraction.writeFraction() + " = -" + sub.writeFraction());
        }
        else {
            System.out.println(this.writeFraction() + " - " + fraction.writeFraction() + " = " + sub.writeFraction());
        }
    }

    public void multi(Fraction fraction){
        Fraction multi = new Fraction(this.numerator * fraction.numerator,
                this.divider * fraction.divider);
        if (gcd(multi) != 1){
            int tempDiv = gcd(multi);
            multi.numerator /=  tempDiv;
            multi.divider /=  tempDiv;
        }
        System.out.println("Operation:");
        System.out.println( this.writeFraction() + " * " + fraction.writeFraction() + " = " + multi.writeFraction());
    }

    public void div(Fraction fraction){
        Fraction div = new Fraction(this.numerator * fraction.divider,
                this.divider * fraction.numerator);
        if (gcd(div) != 1){
            int tempDiv = gcd(div);
            div.numerator /=  tempDiv;
            div.divider /=  tempDiv;
        }
        System.out.println("Operation:");
        System.out.println( this.writeFraction() + " / " + fraction.writeFraction() + " = " + div.writeFraction());
    }

    private int gcd(Fraction fraction){
        int a = fraction.numerator;
        int b = fraction.divider;
        if (a == 0 || b == 0){
            return 0;
        }
        if (a != b){
            while (a != b){
                if(a > b){
                    a = a - b;
                }
                else {
                    b = b - a;
                }
            }
        }
        return a;
    }

    public String writeFraction(){
        if(numerator == 0){
            return "0";
        }
        if (numerator == divider){
            return "1";
        }
        return (numerator + "/" + divider);
    }

}
