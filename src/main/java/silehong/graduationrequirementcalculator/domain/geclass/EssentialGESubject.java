package silehong.graduationrequirementcalculator.domain.geclass;

public enum EssentialGESubject implements GeneralElectiveSubject {
    WRITING("글쓰기", 2),
    CIE("COMMUNICATION IN ENGLISH", 2),
    ACCOUNTING("앙트레프레너십의 회계", 2),
    CREATIVE_AND_COMMUNICATION("창의와 소통", 2),
    DESIGN_THINKING("디자인적 사고와 문제 해결", 2),
    ACT("ACT", 2),
    KOREAN_HISTORY("한국사", 2);

    private final String name;
    private final int credit;
    private boolean isChecked;

    EssentialGESubject(String name, int credit) {
        this.name = name;
        this.credit = credit;
    }

    @Override
    public int getCredit() {
        return credit;
    }

    @Override
    public boolean changeChecked() {
        isChecked = !isChecked;
        return isChecked;
    }
}
