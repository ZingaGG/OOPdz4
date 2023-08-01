package GroupService;

import java.util.List;

import group.StudyGroup;
import model.Student;
import model.Teacher;

public class StudyGroupService {
    

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> student){
        StudyGroup studyGroup = new StudyGroup(teacher, student);
        return studyGroup;
    }
}
