package employeeApp;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        Company company = new Company(1, "Workintech", -1, new String[]{"ilyas"});
        Employee employee = new Employee(1, "İlyas Koç", "ilyaskoc@wit.com.tr", "123456", new String[]{"deneme1"});
        Healthplan healthplan = new Healthplan(1, "rümeysa", Plan.NAME);

        System.out.println(company.toString());
        System.out.println(employee.toString());
        System.out.println(healthplan.toString());
    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
