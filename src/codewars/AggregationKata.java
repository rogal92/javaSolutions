package codewars;

public class AggregationKata {
    public static Map<String, Long> getNumberOfStudentsByDepartment(Stream<Student> students) {
    	
    	Map<String, Long> result = new HashMap<>();
    	List<String> departments = students.map(s -> s.getDepartment())
    	.collect(Collectors.toList());
    	
    	result = departments.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
    	
		return result;
    }
}
