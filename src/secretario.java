public class secretario extends Empleado{
    @Override
    public double getSalario() {
        return super.getSalario() + 5000;
    }
    @Override
    public int getHoras() {
        return super.getHoras();
    }
    @Override
    public String getMesVacaciones() {
        return "Agosto";
    }
    public void MostrarMensaje(){
        System.out.println("Estoy haciendo fotocopias");
    }
}
