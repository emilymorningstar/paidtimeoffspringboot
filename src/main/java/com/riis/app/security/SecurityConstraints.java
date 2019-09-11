package com.riis.app.security;

public class SecurityConstraints {
public static final long EXPERATION_TIME=864000000;//10days in milliseconds
public static final String TOKEN_PREFIX="Bearer ";
public static final String HEADER_STRING="Authorization";
public static final String SIGN_UP_URL="/Employees";
public static final String TOKEN_SECRET="secretkeyssecretkeyssecretkeyssecretkeyssecretkeyssecretkeys"
		+ "secretkeyssecretkeyssecretkeyssecretkeyssecretkeyssecretkeyssecretkeys"
		+ "secretkeyssecretkeyssecretkeyssecretkeyssecretkeyssecretkeyssecretkeys"
		+ "secretkeyssecretkeyssecretkeyssecretkeyssecretkeyssecretkeyssecretkeys"
		+ "secretkeyssecretkeyssecretkeyssecretkeyssecretkeyssecretkeyssecretkeys"
		+ "secretkeyssecretkeyssecretkeyssecretkeyssecretkeyssecretkeyssecretkeys";
}
