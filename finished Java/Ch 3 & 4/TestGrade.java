public class TestGrade
{
private int score;
public void SetScore(int s)
{
score = s;
}
public int getScore()
{
return score;
}
public char getLetterGrade()
{
char grade;
if (score < 60)
grade = 'F';
else if (score < 70)
grade = 'D';
else if (score < 80)
grade = 'C';
else if (score < 90)
grade = 'B';
else if (score <= 100)
grade = 'A';
else grade = '?';
return grade;
}
}