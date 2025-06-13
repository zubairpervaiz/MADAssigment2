package com.example.assignment2;

public class TeacherFragment extends BaseTableFragment {
    @Override
    protected String getApiEndpoint() {
        return "/faculty";
    }

    @Override
    protected String[] getColumnNames() {
        return new String[]{"fid", "fname"};
    }
} 