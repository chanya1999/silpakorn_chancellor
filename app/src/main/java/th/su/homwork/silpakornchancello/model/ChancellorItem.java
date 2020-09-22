package th.su.homwork.silpakornchancello.model;

public class ChancellorItem {
    public final int imageResId;
    public final String nameTextView;
    public final String positionTextView;
    public final String workYearTextView;

    public ChancellorItem(int imageResId, String nameTextView, String positionTextView, String workYearTextView) {
        this.imageResId = imageResId;
        this.nameTextView = nameTextView;
        this.positionTextView = positionTextView;
        this.workYearTextView = workYearTextView;
    }
}
