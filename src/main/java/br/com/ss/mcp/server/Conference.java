package br.com.ss.mcp.server;

import org.springframework.boot.web.servlet.server.Session;

import java.util.List;


public record Conference(String name, int year, String[] dates, String location, List<Session> sessions) {
}