public class PlanoOperadoraTelefonia {
    public static void main(String[] args) {
        
        String plano = "m"; //M / T
        
        switch (plano) {

            case "b","B":
                System.out.println("Plano Telefônico Basico.");
                System.out.println("Voce ganha 100 minutos de ligação");
                break;
            
            case "m","M":
                System.out.println("Plano Telefônico Medio / Midia");
                System.out.println("100 minutos de ligaçao, \n+ Whatsapp e Instagram grátis");
                break;
            
            case "t","T":
                System.out.println("Plano Telefônico Turbo / The Best");
                System.out.println(" Você ganha 100 minutos de ligaçao; \n+ Whatsapp e Instagram grátis;\n+ 5Gb Youtube;");
                break;
            

            default: System.out.println("Opção inválida.");
                break;
        }
        



    }

}
