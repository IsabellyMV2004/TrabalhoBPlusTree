public class Aplicacao
{


    public char menu(){
        System.out.println("# # # B+ TREE # # #");
        System.out.println("\n[A] Inserir");
        System.out.println("[B] Excluir");
    }


    public static void main(String[] args) {
        BTree b = new BPlusTree();

        char op = menu();

        do{
            switch (op){
                case 'A':
                    break;
                case 'B':
            }
            op = menu();
        }while(op!=27);

        b.in_ordem();
    }
}
