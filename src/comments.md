Jeres removeStudent metode i Team klassen virker ikke, se den RemoveTest klasse jeg har tilføjet.
Remove metoden i ArrayList fjerner det objekt der matcher inputet. Men studentList indholder ikke Strings men Students, så 
den vil aldrig matche en String. 

I bliver nød til at finde en student med samme navn som inputet først og så kalde remove, se min implementation af removeStudent.

---

I 

    public double averageGradeTeam() {
        int totalGrades = 0;
        for (Student student : studentList) {
            totalGrades += student.averageGradeStudent();
        }
        return totalGrades / studentList.size();
    }

student.avarageGradeStudent() returnerer en double, som så bliver castet til en int, 
fordi totalGrades er en int, det vil sige at I får en afrundingsfejl. 

---

    public double averageGradeStudent() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

Både sum variables og grades.length er heltal (int), så denne

    sum / grades.length

division vil være heltalsdivision. Cast sum til en double, så I ikke får afrundingsfejl. 

    (double)sum / grades.length

---

