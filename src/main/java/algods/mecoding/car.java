package algods.mecoding;

public class car {


   public class Car {
    String brand;
    int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public boolean isNew() {
        if (year >= 2020){
            return true;
        }
        return false;
    }

    public int ageIn2026() {
        return 2026 - year;
    }

    public void renameToBMW() {
        this.brand = "BMW";
    }

    public void rename(String newBrand) {
        this.brand = newBrand;
    }

    public boolean isBrand(String name) {
        return this.brand.equals(name);
    }

    public boolean isFromBefore(int testYear) {
        return year < testYear;
    }

    public int compareYear(Car other) {
        if (year < other.year){
            return -1;
        } else if (year == other.year){
            return 0;
        } else {
            return 1;
        }
    }

    public void copyBrandFrom (Car other) {
        this.brand = other.brand;
    }

    public boolean sameBrand (Car other) {
        return this.brand.equals(other.brand);
    }

    public boolean newerThan(Car other) {
        return (this.year > other.year);
    }

    public void makeOneYearNewer() {
        this.year += 1;
    }

    public void swapYearWith(Car other){
        int diese = this.year;
        this.year = other.year;
        other.year = diese;
    }

    public boolean hasSameYearAs(Car other){
        return this.year == other.year;
    }

    public void copyYearFrom(Car other){
        this.year=other.year;
    }

    public String fullInfo(){
        return year + " " + brand;
    }

    public void printIfOld(){
        if (this.year < 2020){
            System.out.println(brand +" " + year);
        }
    }

    public void printIfBMW(){
        if (this.brand.equals("BMW")){
            System.out.println(year+" "+brand);
        }
    }

    public boolean isBMWAndOld(){
        return ((this.brand.equals("BMW"))&&(this.year<2020));
        }
    

    public boolean hasBrandLongerThan(int n) {
        return brand.length() > n;
    }

    public boolean isBrandAndYear(String testBrand, int testYear){
        return ((this.brand.equals(testBrand)) && (this.year == testYear));
    }

    public void setToOlderCar(Car other){
        if (this.year > other.year){
            this.year=other.year;
        }
    }

    public void setToNewerCar(Car other){
        if (this.year < other.year){
            this.year=other.year;
        }
    }

    public boolean sameInfo(Car other){
        return ((this.year==other.year)&&(this.brand.equals(other.brand)));
    }

    public void copyInfoFrom(Car other){
        this.brand = other.brand;
        this.year = other.year;
    }

    public boolean isOlderBMWThan(Car other){
        return (this.brand.equals("BMW")&&(this.year < other.year));
    }

    public boolean wasBuiltBetween(int fromYear, int toYear){
        return (fromYear<=this.year)&&(this.year<=toYear);
    }

    public boolean isEitherBrand(String brand1, String brand2){
        return (this.brand.equals(brand1) || this.brand.equals(brand2));
    }
}
}
    
