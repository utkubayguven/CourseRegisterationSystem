from typing import List
from Person import Person
from Semester import Semester
from Advisor import Advisor
from Transcript import Transcript
from Course import Course
from CourseSession import CourseSession
from Schedule import Schedule

class Student(Person):
    def __init__(self, name: str, surname: str, id: int, semester: Semester, advisor: Advisor, transcript: Transcript, selectedCourses: List[Course], selectedSessions: CourseSession, entryYear: int, schedule: Schedule, gpa: float, cgpa: float, completedCredit: int, activeCourses: List[Course], pastCourses: List[Course], nonTakenCourses: List[Course], failedCourses: List[Course]):
        super().__init__(name, surname, id)
        self._semester = semester
        self._advisor = advisor
        self._transcript = transcript
        self._selectedCourses = selectedCourses
        self._selectedSessions = selectedSessions
        self._entryYear = entryYear
        self._schedule = schedule
        self._gpa = gpa
        self._cgpa = cgpa
        self._completedCredit = completedCredit
        self._activeCourses = activeCourses
        self._pastCourses = pastCourses
        self._nonTakenCourses = nonTakenCourses
        self._failedCourses = failedCourses

    def get_full_name(self):
        return f"{self._name} {self._surname}"


    # Getter and setter methods for the semester attribute
    @property
    def semester(self):
        return self._semester

    @semester.setter
    def semester(self, value: Semester):
        self._semester = value

    # Getter and setter methods for the advisor attribute
    @property
    def advisor(self):
        return self._advisor

    @advisor.setter
    def advisor(self, value: Advisor):
        self._advisor = value

    # Getter and setter methods for the transcript attribute
    @property
    def transcript(self):
        return self._transcript

    @transcript.setter
    def transcript(self, value: Transcript):
        self._transcript = value
    
    # Getter and setter methods for the selectedCourses attribute
    @property
    def selectedCourses(self):
        return self._selectedCourses

    @selectedCourses.setter
    def selectedCourses(self, value: List[Course]):
        self._selectedCourses = value

    # Getter and setter methods for the selectedSessions attribute
    @property
    def selectedSessions(self):
        return self._selectedSessions

    @selectedSessions.setter
    def selectedSessions(self, value: CourseSession):
        self._selectedSessions = value

    # Getter and setter methods for the entryYear attribute
    @property
    def entryYear(self):
        return self._entryYear

    @entryYear.setter
    def entryYear(self, value: int):
        self._entryYear = value

     # Getter and setter methods for the schedule attribute
    @property
    def schedule(self):
        return self._schedule

    @schedule.setter
    def schedule(self, value: Schedule):
        self._schedule = value

    # Getter and setter methods for the gpa attribute
    @property
    def gpa(self):
        return self._gpa

    @gpa.setter
    def gpa(self, value: float):
        self._gpa = value

    # Getter and setter methods for the cgpa attribute
    @property
    def cgpa(self):
        return self._cgpa

    @cgpa.setter
    def cgpa(self, value: float):
        self._cgpa = value

    # Getter and setter methods for the completedCredit attribute
    @property
    def completedCredit(self):
        return self._completedCredit

    @completedCredit.setter
    def completedCredit(self, value: int):
        self._completedCredit = value

    # Getter and setter methods for the activeCourses attribute
    @property
    def activeCourses(self):
        return self._activeCourses
    
    @activeCourses.setter
    def activeCourses(self, value: List[Course]):
        self._activeCourses = value

    # Getter and setter methods for the pastCourses attribute
    @property
    def pastCourses(self):
        return self._pastCourses

    @pastCourses.setter
    def pastCourses(self, value: List[Course]):
        self._pastCourses = value

    # Getter and setter methods for the nonTakenCourses attribute
    @property
    def nonTakenCourses(self):
        return self._nonTakenCourses

    @nonTakenCourses.setter
    def nonTakenCourses(self, value: List[Course]):
        self._nonTakenCourses = value

    # Getter and setter methods for the failed_courses attribute
    @property
    def failedCourses(self):
        return self._failedCourses

    @failedCourses.setter
    def failedCourses(self, value: List[Course]):
        self._failedCourses = value

    
    def calculateGPA(self):
        transcript = Transcript()
        credit = transcript.credit
        grade = transcript.grade
        result = grade/credit
        self._gpa = result

    def calculateCumulativeGpa(self):
        transcript = Transcript()
        cCredit = transcript.cumulativeCredit
        cGrade = transcript.cumulativeCredit
        result = cGrade/cCredit
        self._cgpa = result

    def printSelectedCourses(self):
        for course in self._selectedCourses:
            print(course)
    
    def printActiveCourses(self):
        for course in self._activeCourses:
            print(course)
    
    def printPastCourses(self):
        for course in self._pastCourses:
            print(course)

    def printNonTakenCourses(self):
        for course in self._nonTakenCourses:
            print(course)
        
    def printFailedCourses(self):
        for course in self._failedCourses:
            print(course)

    def printSelectedSessions(self):
        for courseSession in self._selectedSessions:
            print(courseSession)

    def __str__(self):
        return f"Student(name='{self._name}', surname='{self._surname}', id={self._id}, emails='{self._email}', semester='{self._semester}', advisor='{self._advisor}', transcript='{self._transcript}', selected_courses='{self._selectedCourses}', selected_sessions='{self._selectedSessions}', entry_year={self._entryYear}, schedule='{self._schedule}', gpa={self._gpa}, cgpa={self._cgpa}, completed_credit={self._completedCredit}, active_courses='{self._activeCourses}', past_courses='{self._pastCourses}', non_taken_courses='{self._nonTakenCourses}', failed_courses='{self._failedCourses}')"