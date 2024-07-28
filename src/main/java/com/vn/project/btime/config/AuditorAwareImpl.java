/* BTime - 2024 */
package com.vn.project.btime.config;

import java.util.Optional;
import org.springframework.data.domain.AuditorAware;

public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        // hardcode - replace when impl spring security
        return Optional.of("hieptran");
    }
}
