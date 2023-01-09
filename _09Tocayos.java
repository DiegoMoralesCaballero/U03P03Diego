package ud04;

public class _09Tocayos {
    

    public static void main(String[] args) {
        String v1[] = {"jose", "diego", "arturo"};
        String v2[] = {"joSe", "diego", "Arturo"};
        int cont=0;
        

        for(int i=0; i<v1.length; i++){
            for(int j=0; j<v2.length; j++){
                if(v1[i].equalsIgnoreCase(v2[j])){
                    System.out.println(v1[i]+" tiene tocayo en la primera arrray.");
                    cont++;
                }
            }

            System.out.println("TOTAL: "+ cont+ " personas del primer grupo tienen tocayo");



         }   
    }
}
