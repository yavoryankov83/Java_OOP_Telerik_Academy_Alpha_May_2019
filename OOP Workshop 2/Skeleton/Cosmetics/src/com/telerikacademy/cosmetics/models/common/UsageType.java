package com.telerikacademy.cosmetics.models.common;

public enum UsageType {
  EVERYDAY {
    @Override
    public String toString() {
      return "EveryDay";
    }
  },
  MEDICAL {
    @Override
    public String toString() {
      return "Medical";
    }
  };
}
