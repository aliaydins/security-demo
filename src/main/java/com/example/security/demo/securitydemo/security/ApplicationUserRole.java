package com.example.security.demo.securitydemo.security;

import com.google.common.collect.Sets;

import java.util.Set;
import static com.example.security.demo.securitydemo.security.ApplicationUserPermission.*;

public enum ApplicationUserRole {
    STUDENT(Sets.newHashSet(STUDENT_READ,STUDENT_WRITE,COURSE_READ)),
    ADMIN(Sets.newHashSet(COURSE_READ,COURSE_WRITE,STUDENT_READ,STUDENT_WRITE));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions=permissions;
    }
    public Set<ApplicationUserPermission> getPermissions(){
        return permissions;
    }
}
