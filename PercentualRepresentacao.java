package EX4;

public class PercentualRepresentacao {
    public static double calculaPercentual(double calculado, double total){
        return (calculado/total) * 100;
    }

    public static void main(String[] args) {
        double SP = 67836.43;
        double RJ = 36678.66;
        double MG = 29229.88;
        double ES = 27165.48;
        double outros = 19849.53;
        double total = SP + RJ + MG + ES + outros;

        System.out.printf("SP - %.2f por cento\n", calculaPercentual(SP, total));
        System.out.printf("RJ - %.2f por cento\n", calculaPercentual(RJ, total));
        System.out.printf("MG - %.2f por cento\n", calculaPercentual(MG, total));
        System.out.printf("ES - %.2f por cento\n", calculaPercentual(ES, total));
        System.out.printf("Outros - %.2f por cento\n", calculaPercentual(outros, total));
    }
}
