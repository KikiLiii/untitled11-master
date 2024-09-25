public class Main {
    public static void main(String[] args) {
        BMI humanBMI = new BMI(64, 1.68);
        System.out.printf("BMI: %.2f\n", humanBMI.calculateBMI());
        System.out.println("Result: " + humanBMI.getResult());
    }
}

class BMI {
    private double weight; // Weight of the person in kilograms
    private double height; // Height of the person in meters

    // Constructor for BMI
    public BMI(double weight, double height) {
        if (weight <= 0 || height <= 0) {
            throw new IllegalArgumentException("Weight and height must be greater than 0.");
        }
        this.weight = weight;
        this.height = height;
    }

    // Getters and setters
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be greater than 0.");
        }
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be greater than 0.");
        }
        this.height = height;
    }

    // Method to calculate BMI
    public double calculateBMI() {
        return weight / (height * height);
    }

    // Method to determine BMI category
    public String getResult() {
        double bmi = calculateBMI();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}
