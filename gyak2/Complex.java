public class Complex {
    
    private double re;
    private double im;

    public Complex(double real, double imaginary) {
        re = real;
        im = imaginary;
    }

    public double abs() {
        return Math.sqrt(Math.pow(re, 2) + Math.pow(im, 2));
    }

    public void add(Complex c) {
        re += c.re;
        im += c.im;
    }

    public void sub(Complex c) {
        re -= c.re;
        im -= c.im;
    }

    public void mul(Complex c) {
        double newRe = re * c.re - im * c.im;
        im = re * c.im + im * c.re;
        re = newRe;
    }

    public void conjugate() {
        im = -im;
    }

    public void reciprocate() {
        double newRe = re / (Math.pow(re, 2) + Math.pow(im, 2));
        im = -im / (Math.pow(re, 2) + Math.pow(im, 2));
        re = newRe;
    }


    public void div(Complex c) {
        double newRe = (re * c.re + im * c.im) / (Math.pow(c.re, 2) + Math.pow(c.im, 2));
        im = (c.im * re - c.re * im) / (Math.pow(c.re, 2) + Math.pow(c.im, 2));
        re = newRe;
    }
}
