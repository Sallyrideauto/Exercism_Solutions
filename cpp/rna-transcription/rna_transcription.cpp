#include "rna_transcription.h"
#include <stdexcept> // 예외 처리를 위해 필요한 헤더

namespace rna_transcription
{
    // DNA 염기 서열을 RNA 염기 서열로 변환하는 함수 정의
    std::string to_rna(const std::string &dna)
    {
        std::string rna;
        rna.reserve(dna.size()); // RNA 문자열의 크기를 미리 예약하여 성능 최적화

        for (char nucleotide : dna)
        {
            rna += to_rna(nucleotide); // DNA 염기를 RNA 염기로 변환하여 RNA 문자열에 추가
        }
        return rna;
    }

    // DNA 염기를 RNA 염기로 변환하는 함수 정의((단일 문자)
    char to_rna(char dna_nucleotide)
    {
        switch (dna_nucleotide)
        {
        case 'G':
            return 'C';
        case 'C':
            return 'G';
        case 'T':
            return 'A';
        case 'A':
            return 'U';
        default:
            // 예외 처리? 잘못된 염기 문자가 들어올 경우
            throw std::invalid_argument("Invalid DNA nucleotide");
        }
    }

} // namespace rna_transcription
