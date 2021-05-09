package org.example.demo.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.convert.WritingConverter;
import org.springframework.data.jdbc.core.convert.JdbcCustomConversions;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;

import java.util.List;
import java.util.UUID;

@Configuration
public class DataJdbcConfiguration extends AbstractJdbcConfiguration {

  @Override
  public JdbcCustomConversions jdbcCustomConversions() {

    return new JdbcCustomConversions();

  }

  @WritingConverter
  enum UuidToStringConverter implements Converter<UUID, String> {

    INSTANCE;

    @Override
    public String convert(UUID source) {
      return source.toString();
    }
  }

  @ReadingConverter
  enum StringToUuidConverter implements Converter<String, UUID> {

    INSTANCE;

    @Override
    public UUID convert(String source) {
      return UUID.fromString(source);
    }
  }
}