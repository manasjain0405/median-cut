package io.github.manasjain0405.mediancut.model;

public class Pixel {

    Long r;
    Long g;
    Long b;
    Double y;
    Double cb;
    Double cr;

    void convertYCbCr() {
        this.setY(0.299*this.r + 0.587*this.g + 0.114*this.b);
        this.setCb(128 - 0.168736*this.r -0.331264*this.g + 0.5*this.b);
        this.setCr(128 + 0.5*this.r - 0.418688*this.g - 0.081312*this.b);
    }

    void convertRGB() {
        this.setR(Math.round(this.y + 1.402*(this.cr - 128)));
        this.setG(Math.round(this.y - 0.344136*(this.cb-128) - 0.714136*(this.cr - 128)));
        this.setB(Math.round(this.y + 1.772*(this.cb - 128)));
    }

    public Pixel(Long r, Long g, Long b) {
        this.r = r;
        this.g = g;
        this.b = b;
        convertYCbCr();
    }

    public Pixel(Double y, Double cb, Double cr) {
        this.y = y;
        this.cb = cb;
        this.cr = cr;
        convertRGB();
    }

    public Long getR() {
        return r;
    }

    public void setR(Long r) {
        this.r = r;
    }

    public Long getG() {
        return g;
    }

    public void setG(Long g) {
        this.g = g;
    }

    public Long getB() {
        return b;
    }

    public void setB(Long b) {
        this.b = b;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getCb() {
        return cb;
    }

    public void setCb(Double cb) {
        this.cb = cb;
    }

    public Double getCr() {
        return cr;
    }

    public void setCr(Double cr) {
        this.cr = cr;
    }
}
