package application;

import entities.Categoria;
import entities.Funcionario;
import entities.FuncionarioCLT;
import entities.FuncionarioTemporario;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Funcionario> list = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader("src\\Funcionarios.csv"))){
            br.readLine();
            String line = br.readLine();

            while (line!= null){
                String[] campos = line.split(",");

                String nome =  campos[0];
                int idade = Integer.parseInt(campos[1]);
                Categoria categoria = Categoria.valueOf(campos[2]);

                switch (categoria) {
                    case CLT -> {
                        double salarioBase = Double.parseDouble(campos[3]);
                        double bonusMensal = Double.parseDouble(campos[4]);
                        list.add(new FuncionarioCLT(nome,idade,categoria,salarioBase, bonusMensal));
                    }
                    case Temporario -> {
                        int diasTrabalhados = Integer.parseInt(campos[5]);
                        double valorDia = Double.parseDouble(campos[6]);
                        list.add(new FuncionarioTemporario(nome, idade, categoria,diasTrabalhados, valorDia));
                    }
                    default -> System.out.println("OCORREU UM ERRO NA LEITRA DO ARQUIVO");
                }

                line = br.readLine();
            }

            list.forEach(f -> System.out.println(f.toString()));
        }
        catch (IOException e){
            System.out.println("ERROR: " + e.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"))) {
            bw.write("BEM VINDO");
            bw.newLine();
            list.forEach(funcionario -> {

                try {
                    bw.write(funcionario.toString());
                    bw.newLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
