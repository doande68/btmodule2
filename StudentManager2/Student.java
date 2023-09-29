package StudentManager2;

public class Student {
    public class Student {
        private int id;
        private String name;
        private double[] scores;
        private String gender;

        public Student(int id, String name, double[] scores, String gender) {
            this.id = id;
            this.name = name;
            this.scores = scores;
            this.gender = gender;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double[] getScores() {
            return scores;
        }

        public String getGender() {
            return gender;
        }

        public double calculateAverageScore() {
            double sum = 0;
            for (double score : scores) {
                sum += score;
            }
            return sum / scores.length;
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Name: " + name + ", Gender: " + gender + ", Average Score: " + calculateAverageScore();
        }
    }
}
