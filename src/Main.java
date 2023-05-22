import java.sql.Array;
import java.util.*;

public class Main {
    static ArrayList <Colaborador> listaDeColaboradores = new ArrayList<>();
    static ArrayList <Cargo> listaDeCargos = new ArrayList<>();

    public static void main(String[] args) {


        listaDeCargos.add(new Cargo("Desenvolvedor Full-Stack", 4000.00, Niveis.JUNIOR));
        listaDeCargos.add(new Cargo("Desenvolvedor Front-end", 3000.00, Niveis.JUNIOR));
        listaDeCargos.add(new Cargo("Desenvolvedor Back-end", 3500.00, Niveis.JUNIOR));
        listaDeCargos.add(new Cargo("Desenvolvedor Front-end", 5000.00, Niveis.PLENO));
        listaDeCargos.add(new Cargo("Desenvolvedor Back-end", 5500.00, Niveis.PLENO));
        listaDeCargos.add(new Cargo("Desenvolvedor Full-Stack", 8000.00, Niveis.SENIOR));

        listaDeColaboradores.add(new Colaborador("Suzana", new Date(), listaDeCargos.get(1)));
        listaDeColaboradores.add(new Colaborador("Kaique", new Date(), listaDeCargos.get(0)));
        listaDeColaboradores.add(new Colaborador("Gabriel", new Date(), listaDeCargos.get(3)));

        listaDeColaboradores.forEach(System.out::println);
//        admitirColaborador("João", new Date(), listaDeCargos.get(5));
//        demitirColaborador("Suzana");
//        listarStatusColaboradores();
        promoverColaborador("Suzana");
        System.out.println("_____Listagem após promoção de Suzana_____");
        listaDeColaboradores.forEach(System.out::println);
        System.out.println("_____Ordenação por salário decrescente_____");
        ordenarSalarioDecrescente(listaDeColaboradores);
        listaDeColaboradores.forEach(System.out::println);

    }

    public static void listarStatusColaboradores (){
            ArrayList<String> listaColaboradoresDesligados = new ArrayList<>();
            ArrayList<String> listaColaboradoresAtivos = new ArrayList<>();

            for (Colaborador c : listaDeColaboradores) {

                if (c.getDtDesligamento() == null ? listaColaboradoresAtivos.add(c.getNome()) : listaColaboradoresDesligados.add(c.getNome()))
                    ;
            }
            System.out.println("Os colaboradores ativos são: " + listaColaboradoresAtivos);
            System.out.println("Os colaboradores desligados são: " + listaColaboradoresDesligados);
        }

    public static void listarColaboradoresPorCargo () {
        for (Cargo cargo : listaDeCargos) {
            System.out.println("Colaboradores por cargo: " + cargo.getDescricao());
            for (Colaborador c : listaDeColaboradores) {

                if (c.getCargo() == cargo) {
                    System.out.println(c.getNome());
                }
            }
        }
    }

    public static void admitirColaborador (String nome, Date dtAdmissão, Cargo cargo){
        listaDeColaboradores.add(new Colaborador(nome, new Date(), cargo));
        System.out.println(listaDeColaboradores);
    }

    public static void demitirColaborador (String nome){
        for (Colaborador c : listaDeColaboradores){
            if(c.getNome() == nome ){
                c.setDtDesligamento(new Date());
            }
        }
    }

    public static void promoverColaborador (String nome){
        Iterator <Colaborador> itColaborador = listaDeColaboradores.iterator();
        while (itColaborador.hasNext()){
            Colaborador c = itColaborador.next();
            if (c.getNome() == nome){
               Integer i = listaDeCargos.indexOf(c.getCargo());
               c.setCargo(listaDeCargos.get(i+1));
            }
        }
    }

    public static void ordenarSalarioDecrescente (List<Colaborador> colaboradores){
        Collections.sort(colaboradores, new Comparator<Colaborador>() {
            @Override
            public int compare(Colaborador o1, Colaborador o2) {
                return Double.compare(o2.getSalario(), o1.getSalario());
            }
        });

    }
 }