package com.example.gena;

public class ApprenticeData {

    private String apprenticeName;
    private String apprenticeDescription;
    private int apprenticePicture;

    public ApprenticeData(String apprenticeName, String apprenticeDescription, int apprenticePicture) {
        this.apprenticeName = apprenticeName;
        this.apprenticeDescription = apprenticeDescription;
        this.apprenticePicture = apprenticePicture;
    }

    public String getApprenticeName() {
        return apprenticeName;
    }

    public String getApprenticeDescription() {
        return apprenticeDescription;
    }

    public int getApprenticePicture() {
        return apprenticePicture;
    }
}
