package br.com.alurrafood.pagamentos.repository;

import br.com.alurrafood.pagamentos.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}

