//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // Fields
    private String name;
    private int grade;

    //Methods
    public String getName(){
        return name;
    }
    public void setName(String value){
        name = value;
    }

    public int getGrade(){
        return grade;
    }
    public void setGrade(int value){
        grade = value;
    }

    public boolean Passed(int value)
    {
        if (value >= 5){
            return true;
        }
        else {
            return false;
        }
    }


    // Main method
    public static void main(String[] args) {

        Main example = new Main();
        example.setName("Luis García");
        example.setGrade(5);

        System.out.println("Nota de " + example.getName());
        System.out.println(example.getGrade());
        System.out.println("Aprobado: " + example.Passed(example.getGrade()));
    }

    // pendiente de pasr de C# a Java

    /*
	private ArrayList listaAlumnos = new ArrayList();

	// Agrega un nuevo alumno a la lista
	//
	public void Agregar(Alumno alu)
	{
		listaAlumnos.Add(alu);
	}

	// Devuelve el alumno que está en la posición num
	//
	public Alumno Obtener(int num)
	{
		if (num >= 0 && num <= listaAlumnos.Count)
		{
			return ((Alumno)listaAlumnos[num]);
		}
		return null;
	}

	// Devuelve la nota media de los alumnos
	//
	public float Media
	{
		get
		{
			if (listaAlumnos.Count == 0)
				return 0;
			else
			{
				float media = 0;
				for (int i = 0; i < listaAlumnos.Count; i++)
				{
					media += ((Alumno)listaAlumnos[i]).Nota;
				}
				return (media / listaAlumnos.Count);
			}
		}
	}


     */

}
