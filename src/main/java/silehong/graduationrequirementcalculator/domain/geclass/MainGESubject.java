package silehong.graduationrequirementcalculator.domain.geclass;

public enum MainGESubject implements GeneralElectiveSubject {
    _4차산업혁명시대의기업경영("4차산업혁명시대의기업경영", Tag.도전),
    건강한삶("건강한삶", Tag.도전),
    경제와사회("경제와사회", Tag.도전),
    내몸의구조와기능("내몸의구조와기능", Tag.도전),
    미래사회와소프트웨어("미래사회와소프트웨어", Tag.도전),
    성의과학("성의과학", Tag.도전),
    소프트웨어코딩과적용("소프트웨어코딩과적용", Tag.도전),
    우주의이해("우주의이해", Tag.도전),
    창업계획("창업계획", Tag.도전),
    트렌드를읽는데이터경영("트렌드를읽는데이터경영", Tag.도전),
    환경과인간("환경과인간", Tag.도전);

    private final String name;
    private final int credit;
    private final Tag tag;
    private boolean isChecked;

    MainGESubject(String name, Tag tag) {
        this.name = name;
        this.credit = 3;
        this.tag = tag;
        isChecked = false;
    }

    @Override
    public int getCredit() {
        return 0;
    }

    @Override
    public boolean changeChecked() {
        isChecked = !isChecked;
        return isChecked;
    }
    }
