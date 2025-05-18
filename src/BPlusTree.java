public class BPlusTree
{
    private No raiz;

    public BTree()
    {
        raiz = null;
    }

    private No navegarAteFolha(int info)
    {

    }

    private No localizarPai(No folha, int info)
    {

    }

    private void split(No folha, No pai)
    {

    }

    public void inserir(int info, int posArq)
    {

    }

    public void in_ordem()
    {
        in_ordem(raiz);
    }

    private void in_ordem(No raiz)
    {
        if(raiz!=null)
        {
            for(int i=0; i<raiz.getTl(); i++)
            {
                in_ordem(raiz.getvLig(i));
                System.out.println(raiz.getvInfo(i));
            }
            in_ordem(raiz.getvLig(raiz.getTl()));
        }
    }

    //exclusao
    private No buscarNo(int info)
    {
        No no=raiz;
        int pos;
        boolean flag=false;
        while(no!=null && !flag)
        {
            pos = no.procurarPosicao(info);
            if(pos<no.getTl() && info == no.getvInfo(pos))
                flag=true;
            else
                no=no.getvLig(pos);
        }
        return no;
    }

    private No localizarSubE(No no, int pos)
    {
        no = no.getvLig(pos);
        while(no.getvLig(0)!=null)
            no=no.getvLig(no.getTl());
        return no;
    }

    private No localizarSubD(No no, int pos)
    {
        no = no.getvLig(pos);
        while(no.getvLig(0)!=null)
            no=no.getvLig(0);
        return no;
    }

    private void redistribuir_concatenar(No folha)
    {

    }

    public void exclusao(int info)
    {

    }
}
