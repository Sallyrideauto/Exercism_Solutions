def to_rna(dna_strand):
    # RNA 상보적인 염기 매핑
    dna_to_rna = {'G': 'C', 'C': 'G', 'T': 'A', 'A': 'U'}

    # 입력된 DNA 문자열이 빈 문자열인 경우 빈 문자열 반환
    if dna_strand == '':
        return ''
    
    # DNA 문자열을 RNA 문자열로 변환
    rna_strand = ''
    for nucleotide in dna_strand:
        if nucleotide in dna_to_rna:
            rna_strand += dna_to_rna[nucleotide]
        else:
            # 올바르지 않은 DNA 염기가 포함되어 있을 경우 오류 처리
            return None
        
    return rna_strand