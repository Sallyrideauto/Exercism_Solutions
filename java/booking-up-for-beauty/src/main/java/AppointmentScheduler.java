import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    // 주어진 문자열을 파싱하여 예약 날짜를 LocalDateTime으로 반환
    public LocalDateTime schedule(String appointmentDateDescription) {
        // 문자열을 LocalDateTime으로 파싱하는 DateTimeFormatter 생성
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        // 문자열을 LocalDateTime으로 변환하여 반환
        return LocalDateTime.parse(appointmentDateDescription, formatter);
    }

    // 주어진 날짜가 현재 날짜 이전인지 여부를 반환
    public boolean hasPassed(LocalDateTime appointmentDate) {
        // 현재 시간을 가져옴
        LocalDateTime currentDateTime = LocalDateTime.now();
        // 예약 날짜와 현재 날짜를 비교하여 예약 날짜가 현재 날짜 이전인지 여부를 반환
        return appointmentDate.isBefore(currentDateTime);
    }

    // 주어진 날짜가 오후인지 여부를 반환
    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        // 예약 시간을 가져옴
        int hour = appointmentDate.getHour();
        // 예약 시간이 오후인지 여부를 반환
        return hour >= 12 && hour < 18;
    }

    // 주어진 예약 날짜에 대한 설명을 반환
    public String getDescription(LocalDateTime appointmentDate) {
        // 예약 날짜에서 날짜 부분을 가져와서 문자열로 반환
        LocalDate date = appointmentDate.toLocalDate();
        String dateString = date.format(DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy"));
        // 예약 날짜의 시간 부분을 가져와서 오후인지 여부 확인
        int hour = appointmentDate.getHour();
        boolean isAfternoon = hour >= 12;
        // 시간을 12시간 형식으로 변환
        int hour12 = hour > 12 ? hour - 12 : hour;
        // 시간이 0시인 경우 12시로 변경
        hour12 = hour12 == 0 ? 12 : hour12;
        // 시간에 대한 문자열 생성
        String timeString = String.format("%d:%02d %s", hour12, appointmentDate.getMinute(), isAfternoon ? "PM" : "AM");
        // 예약 날짜와 시간을 조합하여 설명을 반환
        return "You have an appointment on " + dateString + ", at " + timeString + ".";
    }

    // 기념일에 대한 날짜를 반환
    public LocalDate getAnniversaryDate() {
        // 현재 연도를 가져옴
        int currentYear = LocalDate.now().getYear();
        // 9월 15일의 날짜를 반환
        return LocalDate.of(currentYear, 9, 15);
    }
}
