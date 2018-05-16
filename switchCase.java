class switchCase {
    public static void main(String[] args) {

        double homeValue = 400000;
        boolean homesteadExempt = false;
        double collinCountyRate = 0.192246;
        double collinCollegeRate = 0.79810;

        String city = "Allen";
        double cityTaxRate;

        switch (city) {
        case "Allen":
            cityTaxRate = 0.51000;
            break;
        case "Frisco":
            cityTaxRate = 0.446600;
            break;
        case "McKinney":
            cityTaxRate = 0.540199;
            break;
        case "Plano":
            cityTaxRate = 0.468600;
            break;
        case "Prosper":
            cityTaxRate = 0.52;
            break;
        case "Wylie":
            cityTaxRate = 0.78100;
            break;
        default:
            cityTaxRate = 0.000;
        }

        String schoolDistrict = "McKinney";
        double isdTaxRate;

        switch (schoolDistrict) {
        case "Allen":
            isdTaxRate = 1.57;
            break;
        case "Frisco":
            isdTaxRate = 0.4466;
            break;
        case "McKinney":
            isdTaxRate = 1.62;
            break;
        case "Plano":
            isdTaxRate = 1.439;
            break;
        case "Proser":
            isdTaxRate = 1.67;
            break;
        case "Wylie":
            isdTaxRate = 1.64;
            break;
        default:
            isdTaxRate = 0.00;
            break;
        }

        double totalTaxRate = collinCountyRate + collinCollegeRate + cityTaxRate + isdTaxRate;
        double taxesNonExempt = homeValue / 1000 * totalTaxRate;
        System.out.println("Your property taxes will be $" + totalTaxRate + " this year.");
    }
}