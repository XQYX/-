package com.xk;

import java.util.HashSet;

import java.util.Set;

public class Students {

private String id;

private String name;

public Set courses = new HashSet();

public String getId() {

return id;

}

public void setId(String id) {

this.id = id;

}

public String getName() {

return name;

}

public void setName(String name) {

this.name = name;

}

public Set getCourses() {

return courses;

}

}
