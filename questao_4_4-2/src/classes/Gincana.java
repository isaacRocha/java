package classes;

public class Gincana {

    public int pontos;
    public int totalDePontosA;
    public int totalDePontosB;
    public int totalDePontosC;

    public int primeiraEquipe(int pontos) {
        this.totalDePontosA += pontos;
        this.pontos = pontos;
        return pontos;
    }

    public int segundaEquipe(int pontos) {
        this.totalDePontosB += pontos;
        this.pontos = pontos;
        return pontos;
    }

    public int terceiraEquipe(int pontos) {
        return this.totalDePontosC += pontos;

    }

    public int removerPontosPrimeiraEquipe(int pontos) {
        return this.totalDePontosA -= pontos;

    }

    public int removerPontosSegundaEquipe(int pontos) {
        return this.totalDePontosB -= pontos;

    }

    public int removerPontosTerceiraEquipe(int pontos) {
        return this.totalDePontosC -= pontos;

    }

    public void finalGincana() {
        if (this.totalDePontosA > this.totalDePontosB && this.totalDePontosA > this.totalDePontosC) {
            System.out.println("Equipe A Ganhou - " + "total de pontos: " + this.totalDePontosA);
        }
        if (this.totalDePontosB > this.totalDePontosA && this.totalDePontosB > this.totalDePontosC) {
            System.out.println("Equipe B Ganhou - " + "total de pontos: " + this.totalDePontosB);
        }
        if (this.totalDePontosC > this.totalDePontosA && this.totalDePontosC > this.totalDePontosB) {
            System.out.println("Equipe C Ganhou - " + "total de pontos: " + this.totalDePontosC);
        } else if (this.totalDePontosA == this.totalDePontosB && this.totalDePontosA == this.totalDePontosC) {
            System.out.println("empate - " + "total de pontos: " + this.totalDePontosA);
        } else if (this.totalDePontosA == this.totalDePontosB) {
            System.out.println("empate, Equipe A e Equipe B - " + "total de pontos: " + this.totalDePontosA);
        } else if (this.totalDePontosA == this.totalDePontosC) {
            System.out.println("empate, Equipe A e Equipe C - " + "total de pontos: " + this.totalDePontosA);
        } else if (this.totalDePontosB == this.totalDePontosC) {
            System.out.println("empate, Equipe B e Equipe C - " + "total de pontos: " + this.totalDePontosB);
        }
    }

}
