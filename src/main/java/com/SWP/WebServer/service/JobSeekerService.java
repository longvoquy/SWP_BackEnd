package com.SWP.WebServer.service;

import com.SWP.WebServer.dto.ContactInfoDto;

public interface JobSeekerService {
    void updateContactInfo(
            ContactInfoDto body,
            String userId);
}
